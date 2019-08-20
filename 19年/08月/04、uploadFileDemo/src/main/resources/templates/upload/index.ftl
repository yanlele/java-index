<html>
<head>
    <meta charset="utf-8">
    <title>上传文件</title>
    <script src="https://cdn.bootcss.com/jquery/1.11.0/jquery.min.js"></script>
</head>

<body>
<div>
    <form id="upForm" method="post" enctype="multipart/form-data">
        <table id="table_report" >
            <tr>
                <td>上传文件:</td>
                <td><input type="file" name="myfile"></td>
            </tr>
            <tr>
                <td>
                    <button type="button" id="saveBtn" >提交</button>
                </td>
            </tr>
        </table>
    </form>
</div>

<script>
  $('#saveBtn').on('click', () => {
    $.ajax({
      url: "/api/upload",
      type: "POST",
      cache: false,
      processData: false,
      contentType: false,
      dataType: "json",
      //data:$('#upForm').serialize(),
      data: new FormData($('#upForm')[0]),
      beforeSend: function () {
        uploading = true;
        console.log(uploading);
      },
      success: function (data) {
        const json = eval('(' + data + ')');
        if (json.result == "success") {
          alert("操作成功!");
        } else {
          alert(json.msg);
        }
        uploading = false;
      }
    });
  })
</script>
</body>
</html>
