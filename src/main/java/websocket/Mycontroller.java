package websocket;

import java.io.IOException;

 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/checkcenter")
public class MyController {
	//推送数据接口
	@ResponseBody
	@RequestMapping("/socket/push/{cid}")
	public String pushToWeb(@PathVariable String cid,String message) {  
		try {
			WebSocketServer.sendInfo(message,cid);
		} catch (IOException e) {
			e.printStackTrace();
			return "failure";
		}  
		return "success";
	} 
} 

