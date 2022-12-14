package tn.esprit.wedding.models

import java.util.*


data class Checklist(
    var _id: String ,
    var nom: String? = null,
    var type: String?= null,
    var note: String? = null,
    var image: String? = null,
    var date: Date,
    var status: String? = null,
    var user_id: String? = null,
    var __v:Int=0
)

data class ResponseChecklist (
    var _id:String?=null,
    var nom: String? = null,
    var type: String?= null,
    var note: String? = null,
    var image: String? = null,
    var date: Date,
    var status: String? = null,
    var user_id: String? = null,
    var __v:Int=0
)
data class ChecklistResponse (var message: String? = null,
                          var checklist:ResponseChecklist?=null,
                          var accessToken: String)