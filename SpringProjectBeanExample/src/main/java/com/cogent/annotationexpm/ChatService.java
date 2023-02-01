package com.cogent.annotationexpm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatService {
	
		private final HistoryService hs;
		private final ChatRoomService crs;
		
		@Autowired
		public ChatService(HistoryService hs, ChatRoomService crs) {
			this.hs = hs;
			this.crs = crs;
		}

		public void chat() {
			crs.start();
			hs.store();			
		}
		
		
	
}
