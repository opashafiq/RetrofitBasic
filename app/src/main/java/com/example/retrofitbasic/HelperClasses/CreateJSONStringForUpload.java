package com.example.retrofitbasic.HelperClasses;

import com.example.retrofitbasic.Models.PartDetails;
import com.google.gson.Gson;

import java.util.List;

public class CreateJSONStringForUpload {
    Gson gson=new Gson();
    public String CreatePartDetailsMaster(List<PartDetails> pd){
        StringBuilder sb = new StringBuilder();
        sb.append(gson.toJson(pd).toString());
        return sb.toString();
    }
}
