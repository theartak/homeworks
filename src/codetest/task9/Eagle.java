package codetest.task9;

public class Eagle extends Bird {
    @Override
    public boolean run(){
        return false;
    }

    @Override
    public boolean fly(){
        return true;
    }

    @Override
    public boolean bark(){
        return false;
    }
}
