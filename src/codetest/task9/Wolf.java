package codetest.task9;

public class Wolf extends Mammal {
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
