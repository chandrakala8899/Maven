package org.example.Map;


import java.util.*;

public class MapTest {
 public static void main(String[] args) {
  Map<Integer, Ticket> ticketMap = new HashMap<>();
  List<Ticket> ticketList = new ArrayList<>();

  for (int i = 0; i < 50000; i++) {
   Ticket ticket1 = new Ticket();
   ticket1.price = "500";
   ticket1.PNR = "12345677" + i;

   Ticket ticket2 = new Ticket();
   ticket2.price = "500";
   ticket2.PNR = "12345677" + i + 1;

   ticketList.add(ticket1);
   ticketList.add(ticket2);

   ticketMap.put(ticket1.hashCode(), ticket1);
   ticketMap.put(ticket2.hashCode(),ticket2);

  }
// Set<Map.Entry<Integer,Ticket>>entrySet= ticketMap.entrySet();
//  Iterator<Map.Entry<Integer,Ticket>>iterator= entrySet.iterator();
//  for(;iterator.hasNext();){
//   Map.Entry<Integer,Ticket>entry = iterator.next();
//   System.out.println("Key " + entry.getKey() + "Value " +entry.getValue());
//
//  }

  ticketMap.forEach((k, v) -> {
   System.out.println("Key " + k + "Value " + v);
  });
  Ticket ticket3 = new Ticket();
  ticket3.price = "500";
  ticket3.PNR = "123456777";
  System.out.println("List Start Time ");
  Long listStartTime = System.currentTimeMillis();

  Iterator<Ticket> ticketIterator = ticketList.iterator();
  for (; ticketIterator.hasNext(); ) {
   Ticket tic = ticketIterator.next();
   if (tic.equals(ticket3)) {
    System.out.println("Ticket3" + tic.PNR);
    break;
   }
  }

   Long listEndTime = System.currentTimeMillis();
   //System.out.println( "List Size" + ticketList.size());
   System.out.println("List Time " + (listEndTime - listStartTime));

   System.out.println(" Ticket From Map");
   Long startMapTime = System.currentTimeMillis();
   Ticket mapTicket = ticketMap.get(ticket3.hashCode());
   System.out.println("Ticket From The Map " + mapTicket.PNR);
   Long endMapTime = System.currentTimeMillis();

   //System.out.println(" MapSize " + ticketMap.size());
   System.out.println("Map Time " + (endMapTime - startMapTime));
  }
 }









