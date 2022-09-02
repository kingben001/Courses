
public class demo {

    public static void main(String[] args) {

        math m1 = new math("MTH",263,"Presents concepts of limits, derivatives, differentiation of various types of functions and use of differentiation \n" +
                "rules, application of differentiation, antiderivatives, integrals and applications of integration. Lecture 4 hours. \n" +
                "Total 4 hours per week. This is a Passport Transfer Course","Math\n");
        econ e1 = new econ("ECO",201,"Presents the fundamental macroeconomic concepts, theories, and issues including the study of scarcity and \n" +
                "opportunity cost, supply and demand, national economic growth, inflation, recession, unemployment, fiscal and \n" +
                "monetary policies, and international trade. Develops an appreciation of how these economic concepts apply to \n" +
                "consumer, business, and government decisions, and their effect on the overall economy. This is a Passport \n" +
                "Transfer course. Lecture 3 hours per week", "Not found\n");
        history h1 = new history("HIS",101,"Examines the development of western civilization from ancient times to the present. Part I of II. Lecture 3 \n" +
                "hours per week","Not found\n");


        System.out.println(m1);
        System.out.println(e1);
        System.out.println(h1);
    }

}