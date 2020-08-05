package com.designModel.state;

/**
 * @program: Design
 * @description: 状态类
 * @author: sikuncheng
 * @create: 2020-07-31 18:03
 **/
public class StateTest {
    public static void main(String[] args) {
        State state = new State();
        Context context = new Context(state);
        state.setValue("001");
        context.method();

        state.setValue("002");
        context.method();
    }
}
//核心类
class State{
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("excute fun1");
    }

    public void method2(){
        System.out.println("excute fun2");
    }
}
//全局类
class Context{
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void method(){
        if (state.getValue().equals("001")){
            state.method1();
        }else if (state.getValue().equals("002")){
            state.method2();
        }
    }
}
