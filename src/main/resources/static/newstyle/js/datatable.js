$(document).ready( function () {
    console.log('Hellohafjslaf');
    var table = $('#BranchMSTR').DataTable({
        "sAjaxSource": "/api/branches",
        "sAjaxDataProp": "",
        "order": [[ 0, "asc" ]],
        "aoColumns": [
            { "mData": "branchNo"},
            { "mData": "name" }
        ]
    })
});
