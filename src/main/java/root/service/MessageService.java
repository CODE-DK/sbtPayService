package root.service;

import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Service;
import root.entity.Message;
import root.entity.Statistic;
import root.repo.MessageRepo;

import javax.persistence.LockModeType;
import javax.transaction.Transactional;

@Service
public class MessageService {

    private final MessageRepo messageRepo;

    public MessageService(MessageRepo messageRepo) {
        this.messageRepo = messageRepo;
    }

    @Transactional
    @Lock(LockModeType.OPTIMISTIC_FORCE_INCREMENT)
    public Message save(Message message) {
        return messageRepo.save(message);
    }

    public Statistic getStatistic() {
        return new Statistic(messageRepo.getPointStatistic(), messageRepo.getDateStatistic());
    }
}
