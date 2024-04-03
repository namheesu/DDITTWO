package kr.or.ddit.enumpkg;

public enum OperatorType {
	PLUS('+',(l,r)->l+r),  //상수의 이름, sign, operate
	MINUS('-',(l,r)->l-r), 
	MULTIPLY('*',(l,r)->l*r), 
	DIVIDE('/',new BiOperandOperator() {
		public double operate(double leftOp, double rightOp) {
			return leftOp/rightOp;
		}
	});
	
	private OperatorType(char sign, BiOperandOperator realOperator) {
		this.sign = sign;
		this.realOperator = realOperator;
	}

	private BiOperandOperator realOperator;
	private char sign;
	public char getSign() {
		return sign;
	}
	
	public double operate(double leftOp, double rightOp) {
		return realOperator.operate(leftOp, rightOp);
	}
	
	public String getExpression(double leftOp, double rightOp) { 
		return String.format("%f %c %f = %f" ,leftOp, sign ,rightOp, operate(leftOp, rightOp));
		
	}
	
	@FunctionalInterface 
	public static interface BiOperandOperator{//추상메소드 하나만 할당 
		public double operate(double leftOp, double rightOp);
	}

}
