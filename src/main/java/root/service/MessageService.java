package root.service;

import org.springframework.stereotype.Service;
import root.entity.Message;
import root.entity.Statistic;
import root.repo.MessageRepo;

@Service
public class MessageService {

    private final MessageRepo messageRepo;

    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    public Message save(Message message){
        return messageRepo.save(message);
    }

    public Statistic getStatistic(){
        return new Statistic(messageRepo.findPointCount(), messageRepo.findDateCount());
    }
}
