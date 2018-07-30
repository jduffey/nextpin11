//package discarded;
//
//public class SecretNumber {
//
//    public static int findSecretNumber(Customer customer, Pinpad pinpad) {
//
//        int posAnc = pinpad.getPosOfValue(customer.getAnchorNumber());
//        int posDir = pinpad.getPosOfValue(customer.getDirectionNumber());
//
//        int movementNumber;
//
//        if (posAnc == 0 && posDir == 6 ||
//                posAnc == 1 && posDir == 7 ||
//                posAnc == 2 && posDir == 8) {
//            movementNumber = 6;
//        } else if (posAnc == 6 && posDir == 0 ||
//                posAnc == 7 && posDir == 1 ||
//                posAnc == 8 && posDir == 2) {
//            movementNumber = 3;
//        } else if ((0 == (posAnc + 1) % pinpad.getSquareSize() && posDir == posAnc - (pinpad.getSquareSize() - 1))) {
//            movementNumber = 1;
//        } else if ((posAnc % pinpad.getSquareSize() == 0 && posDir == posAnc + (pinpad.getSquareSize() - 1)))
//        {
//            movementNumber = -1;
//        } else
//            movementNumber = posDir - posAnc;
//
//        int positionOfMiddleOfPinpadSquare = pinpad.getArraySizeOfPinPad() / 2;
//
//        return pinpad.get((positionOfMiddleOfPinpadSquare + movementNumber) % pinpad.getArraySizeOfPinPad());
//
//    }
//}
