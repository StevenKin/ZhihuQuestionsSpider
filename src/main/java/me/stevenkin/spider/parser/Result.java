package me.stevenkin.spider.parser;

import me.stevenkin.spider.download.Page;
import me.stevenkin.spider.download.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wjg on 2017/4/26.
 */
public class Result {
    private List<Request> requests;
    private Map<String,Object> result;
    private boolean isSkip;
    private Page page;

    public Result(){
        this.requests = new ArrayList<>();
        this.result = new HashMap<>();
        this.isSkip = false;
    }

    public Result addRequest(Request request){
        this.requests.add(request);
        return this;
    }

    public Result putData(String key,Object value){
        this.result.put(key,value);
        return this;
    }

    public boolean isSkip(){
        return this.isSkip;
    }

    public Result setPage(Page page){
        this.page = page;
        return this;
    }

    public Page getPage() {
        return page;
    }

    public void setSkip(boolean isSkip){
        this.isSkip = isSkip;
    }

    public List<Request> getRequests(){
        return this.requests;
    }

    public Object getData(String key){
        return this.result.get(key);
    }

    @Override
    public String toString() {
        return "Result{" +
                "requests=" + requests +
                ", result=" + result +
                ", isSkip=" + isSkip +
                '}';
    }
}
