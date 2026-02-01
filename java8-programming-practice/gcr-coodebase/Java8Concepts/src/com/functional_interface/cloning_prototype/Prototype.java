package com.functional_interface.cloning_prototype;

public class Prototype implements Cloneable {

    private String modelName;
    private int version;

    public Prototype(String modelName, int version) {
        this.modelName = modelName;
        this.version = version;
    }
    
    public void setVersion(int version) {
    	this.version = version;
    }

    //CloneNotSupportedException : if this exception occur that means the class in not implementing Cloneable interface
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();   // shallow copy
    }

    @Override
    public String toString() {
        return "Prototype [modelName=" + modelName + ", version=" + version + "]";
    }
}
