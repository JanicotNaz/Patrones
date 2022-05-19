package comportamiento.chainresponsability

class 道具 {
    companion object {
        fun エラーのメッセージを送信する(技術: () -> Boolean): Boolean{return 技術()}

     //   private fun setValueEditext(editText: EditText?, message: String, title: String, operacion: (editText: EditText?, message: String, title: String) -> Boolean): Boolean{ return operacion(editText, message, title) }
//                            objAny?.let { fragmentProviderBranchType.dialogUpdate(getModel(objAny)) } ?: run{ fragmentProviderBranchType.dialogNew(getModel(objAny))}
        //    private fun validationEmpty(activity: Activity, validation: ModeloLocalBoolean): Boolean = functionBoolean{arrayEditText?.forEach { if (it?.editText?.text.toString().trim() == ""){ validation.apply { varBoolean = setValueEditext(it.editText, activity.getString(R.string.login_llena_campos), it.title!!){e,m,t -> e?.error = m; false}  } } }; validation.varBoolean!! }
    }
}