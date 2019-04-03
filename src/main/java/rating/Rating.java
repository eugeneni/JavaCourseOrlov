package rating;

public class Rating
{
    public String studentMark(int mark) throws Exception
    {
        String newMark;

        if (mark == 1) {
            newMark = "E";
        } else if (mark > 1 && mark <= 3) {
            newMark = "D";
        } else if (mark > 3 && mark <= 6) {
            newMark = "C";
        } else if (mark > 6 && mark <= 9) {
            newMark = "B";
        } else if (mark > 9 && mark <= 12) {
            newMark = "A";
        } else throw new Exception();

        return newMark;
    }

    public String studentMarkSwitch(int mark) throws Exception
    {
        String newMark;

        switch (mark)
        {
            case 1:
                newMark = "E";
                break;
            case 2:
                newMark = "D";
                break;
            case 3:
                newMark = "D";
                break;
            case 4:
                newMark = "C";
                break;
            case 5:
                newMark = "C";
                break;
            case 6:
                newMark = "C";
                break;
            case 7:
                newMark = "B";
                break;
            case 8:
                newMark = "B";
                break;
            case 9:
                newMark = "B";
                break;
            case 10:
                newMark = "A";
                break;
            case 11:
                newMark = "A";
                break;
            case 12:
                newMark = "A";
                break;

            default: throw new Exception();
        }

        return newMark;
    }
}