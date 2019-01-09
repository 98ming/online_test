package nuc.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Component;

@Component
public class HelloAction extends ActionSupport {

    public void insert(){
        System.out.println("【insert】");
    }


    @Override
    public String execute() throws Exception {
        return super.execute();
    }
}
