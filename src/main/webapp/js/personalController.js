app.controller('personalController',function ($scope,$http,$rootScope) {
    $rootScope.user=JSON.parse(getCookie('user'));
    $http({
        method:'GET',
        url:'http://localhost:8080/person/'+$rootScope.user.user_id
    }).success(function (data) {
        console.log(data);
        $scope.person=data;
    });

    $scope.update=function (person) {
        console.log(person);
        var user_id=$rootScope.user.user_id;
        var file=document.querySelector("input[type=file]").files[0];
        /*console.log(person.nickname)*/
        $http({
            url:'http://localhost:8080/user',
            method:'POST',
            data:{
                "user_id":user_id,
                "nickname":person.nickname,
                "description":person.description,
                "file":file
            },
            headers:{'Content-Type':undefined},//请求头的设置
            transformRequest:function (data) {
                var formData=new FormData();
                formData.append('user_id',data.user_id);
                formData.append('nickname',data.nickname);
                formData.append('description',data.description);
                formData.append('file',data.file);
                return formData;
            }


        }).success(function (data) {
            swal({
                title:'修改成功',
                type:'success',
                timer:1000,
                showConfirmButton:false
            });
            setTimeout("window.location.reload()",1050);
            setCookie("user",data);
        })
    }
});

function getPicture() {
    $('#photo').click();
}

function setImage(docObj,localImageId,imgObjPreview) {
    var f=$(docObj).val();
    f=f.toLowerCase();
    var strRegex=".bmp|jpg|png|jpeg$";
    var re=new RegExp(strRegex);
    if (re.test(f.toLowerCase())){

    }else {
        alert("请选择正确格式的图片");
        file=$('#photo');
        file.after(file.clone());
        file.remove();
        return false;
    }
    if (docObj.files&& docObj.files[0]){
        imgObjPreview.src=window.URL.createObjectURL(docObj.files[0]);
    }else{
        docObj.select();
        var imgSrc=document.selection.createRange().text;
        try {
            localImageId.style.filter="progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
            localImageId.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src=imgSrc;
        }catch (e){
            alert("你上传的图片格式不正确，请重新选择");
            return false;
        }

        imgObjPreview.style.display='none';
        document.selection.empty();
    }

    return true;
}
