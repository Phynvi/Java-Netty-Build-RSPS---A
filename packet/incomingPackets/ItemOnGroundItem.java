/*
* @ Author - Digistr
* @ info - none.
*/

package com.packet.incomingPackets;

import com.packet.PacketAssistant;
import com.packet.Packet;
import com.model.Player;

public class ItemOnGroundItem implements PacketAssistant {

	public ItemOnGroundItem() {

	}

	public void send(Player p, Packet packet){
		p.packetDispatcher().sendPingPacket();
	}
}