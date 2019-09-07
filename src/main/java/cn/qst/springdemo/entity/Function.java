package cn.qst.springdemo.entity;


import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2019/9/4 18:29
 * @description
 */
@Component
public class Function {
    private int id;
    private String functionName;

    public Function() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    @Override
    public String toString() {
        return "Function{" +
                "id=" + id +
                ", functionName='" + functionName + '\'' +
                '}';
    }
}
