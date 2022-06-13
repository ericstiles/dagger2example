package com.ets.payment.model.fields;

//interface StringId extends id<String> {

public interface StringId extends Id<String> {
    String getId();
}


//    public  getId();

//    private final String value;
//
//    private StringId(String value){
//        this.value = value;
//    }
//
//    @Override
//    public String getId() {
//        return null;
//    }

//    public static StringId create(String value){
//        return new StringId(value);
//    }

