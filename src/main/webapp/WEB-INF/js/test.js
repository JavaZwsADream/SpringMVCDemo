$(document).ready(function () {

    var data={

        realName:'role',
        note:'hao',
        pageParam:{
            start:1,
            limit:1
        }
    }

  $.post({
      url:'http://localhost:8080/Role/getRolewithPage',
      contentType:'application/json',
      data:JSON.stringify(data),
      success:function (result) {
          alert(result);
          console.log(result);

      }

  })

})