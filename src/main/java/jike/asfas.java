package jike;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-05-08 19:15
 * @Vertion 1.0
 **/
public class asfas {

    public static void main(String[] args){
        String a = "243,212,104,209,131,202,52,2063,170,196,160,63,154,96,76,144,56,193,2031,218,213,91,270,18,201,122,235,190,86,112,128,234,102,2002,75,116,19,251,250,72,233,239,168,73,120,171,231,51,230,194,121,37,189,178,242,105,164,28,208,165,206,167,262,225,44,80,45,183,192,282,184,346,345,241,23,33,232,2007,180,146,64,259,147,254,238,271,220,177,2,2065,186,222,215,198,2064,249,88,158,244,67,329,176,11,257,43,191,314,126,278,46,181,70,84,342,157,82,2000,335,138,152,173,53,240,127,185,103,228,205,188,256,248,179,114,39,258,148,237,247,200,113,260,268,236,226";


        String b = "212,243,11,88,45,2007,148,46,39,120,52,122,147,91,114,167,112,103,33,64,126,67,102,165,116,75,51,96,37,18,70,113,44,43,82,86,76,105,72,168,157,171,158,80,2063,131,63,170,152,160,2031,127,104,180,2064,53,178,188,121,73,179,128,181,2065,176,183,205,196,186,209,206,200,19,191,189,84,192,190,144,184,154,173,138,185,213,194,198,23,215,177,226,218,201,225,222,56,202,230,228,193,233,232,237,235,236,238,248,240,241,254,247,244,220,231,256,2000,242,239,258,257,259,260,251,249,262,268,250,271,335,234,278,146,282,2002,345,314,2,329,270,342,346,";

        String[] split = b.split(",");
        HashMap<String, String> map = new HashMap<>();
        for(String str : split){
            map.put(str,str);
        }

        String[] splita = a.split(",");
        List<String> list = new ArrayList<>();
        for(String stra : splita){
            if(!map.containsKey(stra)){
                list.add(stra);
            }
        }

        System.out.println(JSONArray.toJSONString(list));



    }



}
