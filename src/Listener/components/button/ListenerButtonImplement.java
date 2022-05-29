package Listener.components.button;

  abstract class  ListenerButtonImplement{
	
	 private boolean isUpdate = false;
	 private boolean isUpdate1;
	 boolean isUpdate2=false;
	 boolean isclickOnOperator=false;
	 boolean isNumber=false;
	 boolean isclickOnSubstract=false;
	 boolean isclickOnExponential=false;
	 boolean isclickOnExponent=false;
	 boolean isclickOnAddition=false;
	 boolean isclickOnConsinus=false;
	 boolean isclickOnSinus=false;
	 boolean isclickOntangente=false;
	 boolean isclickOnLog=false;
	 boolean isclickOnDash=false;
	 double result=0;
	 double number=0;
	 
	
	 public void setIsUpdate(Boolean isUpdate) {
		 this.isUpdate=isUpdate;
	 }
	 public Boolean getUpdate() {
		 return this.isUpdate;
	 }
	 public void setIsUpdate1(Boolean isUpdate1) {
		 this.isUpdate1=isUpdate1;
	 }
	 public Boolean getUpdate1() {
		 return this.isUpdate1;
	 }
	 
}
