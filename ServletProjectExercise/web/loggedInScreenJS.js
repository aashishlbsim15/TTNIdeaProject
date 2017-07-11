/**
 * Created by hackerfreak on 4/7/17.
 */
function callFunc() {
    var x=document.forms["saveBlogForm"]["title"].value;
    var y=document.forms["saveBlogForm"]["blogContent"].value;
    if(x=="")
    {
        window.alert("plese enter a title");
        return false;
    }
    if(y.length<10)
    {
       window.alert("please add some content of atleast 10 characters");
        return false;
    }
    return true;
}