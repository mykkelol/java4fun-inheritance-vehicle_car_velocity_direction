//package FASTplsFAST;
//
//public class analogClock {
//    // Given a 12-hour analog clock, compute in degree the smaller angle between the hour and minute hands. Be as precise as you can.
//        // hour hand
//            // 60 minutes is 30 degrees
//            // 30 minutes is 15 degrees
//            // 2 minutes is 1 degrees and therefore 1 minute is .5 degree
//        // minute hand
//            // 5 minutes in 30 degrees
//            // 1 minute is then 6 degree
//        // in essence, hr hand: .5d/min and min hand: 6d/min
//        // QUE: 3:30
//        // hr hand
//            // 3h* 60m = 180m * .5d = 90d
//            // 30min * .5d = 15d
//        // min hand
//            // 30m * 6d = 180d
//        // ANS: min-hr = 180 - (90+15) = 75d
//
//    public static double clock(double hr, double min){
//        double hrHand = (hr * 60) * .5;
//        hrHand += min * .5;
//        double minHand = min * 6;
//        double total = minHand - hrHand;
//    }
//}
