package zw.co.ngoniutete.notekeeper2

class CourseInfo(val id:String,val title:String) {
    override fun toString(): String {
        return title
    }
}

class NoteInfo(var course:CourseInfo, var title:String, var text:String)