package com.Proyecto.Proyecto.dao;



import com.Proyecto.Proyecto.domain.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ChatRepository extends JpaRepository<Chat,Integer> {

    // JPQL SELECT ch FROM CpChat ch WHERE ch.cpUserUserId.userId = 1 ORDER BY ch.chatId DESC <<LIMIT 1>>
    @Query(value = "SELECT * FROM chat where  botUserId= ?1 ORDER BY id_chat DESC LIMIT 1", nativeQuery = true)
    public Chat findLastChatByBotUserId(Integer botUserId);
}
