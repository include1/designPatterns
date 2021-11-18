package com.zm.design.adapter;

public class ObjectAdapter implements Inteferace5V,AdapterMain.innerInterface{
    private Source220V source220V;

    public ObjectAdapter(Source220V source220V){
        this.source220V = source220V;
    }

    @Override
    public Integer get5V() {
        test();
        return source220V.getValue()/44;
    }
}
