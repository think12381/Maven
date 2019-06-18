package com.wisely.highlg_spring4;

public class UseFunctonService1 {

    FunctionService1 functionService1;

    public void setFunctionService1(FunctionService1 functionService1) {
        this.functionService1 = functionService1;
    }

    public String sayHello(String word){
        return functionService1.sayHello(word);
    }
}
