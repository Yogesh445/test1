package mapper;

import com.example.demo.clientRequest.NoonAcademyClientRequest;
import org.springframework.stereotype.Component;
/*
 * Created by Yogesh Sharma on 22/06/2019.
 * */

@Component
public class ServerMapper {

    public NoonAcademyClientRequest getClientRequest(String str[]) {
        NoonAcademyClientRequest request = new NoonAcademyClientRequest();
        request.setStrData(str);
        return request;
    }

}
