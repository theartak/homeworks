package codetest.task9;

public class Dog extends Mammal {
    @Override
    public boolean run(){
        return true;
    }

    @Override
    public boolean fly(){
        return false;
    }

    @Override
    public boolean bark(){
        return true;
    }
}
