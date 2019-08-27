package root.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import root.entity.Commission;
import root.entity.Message;
import root.entity.Statistic;
import root.service.MessageService;

@RestController
public class MessageController {

    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @RequestMapping("/pay")
    public Commission pay(@RequestBody Message message) {
        Message save = service.save(message);
        return new Commission(save);
    }

    @RequestMapping("/stat")
    public Statistic stat() {
        return service.getStatistic();
    }
}
