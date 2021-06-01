package com.pap.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestion(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "A que país percentence a bandeira?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )

        questionList.add(que1)

        val que2 = Question(
            2, "A que país percentence a bandeira?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionList.add(que2)

        val que3 = Question(
            3, "A que país percentence a bandeira?",
            R.drawable.ic_flag_of_brazil,
            "Bielorrússia", "Belize",
            "Brunei", "Brasil", 4
        )

        questionList.add(que3)

        // 4
        val que4 = Question(
            4, "A que país percentence a bandeira?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgica",
            "Barbados", "Belize", 2
        )

        questionList.add(que4)

        // 5
        val que5 = Question(
            5, "A que país percentence a bandeira?",
            R.drawable.ic_flag_of_fiji,
            "Gabão", "França",
            "Fiji", "Finlândia ", 3
        )

        questionList.add(que5)

        // 6
        val que6 = Question(
            6, "A que país percentence a bandeira?",
            R.drawable.ic_flag_of_germany,
            "Alemanha", "Geórgia",
            "Grecia", "Nenhum deles", 1
        )

        questionList.add(que6)

        // 7
        val que7 = Question(
            7, "A que país percentence a bandeira?",
                R.drawable.ic_flag_of_denmark,
            "Dominica", "Egito",
            "Denmark", "Etiópia", 3
        )

        questionList.add(que7)

        // 8
        val que8 = Question(
            8, "A que país percentence a bandeira?",
            R.drawable.ic_flag_of_india,
            "Irlanda ", "Irão",
            "Hungria", "India", 4
        )

        questionList.add(que8)

        // 9
        val que9 = Question(
            9, "A que país percentence a bandeira?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "Nova Zelândia",
            "Tuvalu", "Estados Unidos", 2
        )

        questionList.add(que9)

        // 10
        val que10 = Question(
            10, "A que país percentence a bandeira?",
            R.drawable.ic_flag_of_kuwait,
            "Koweit ", "Jordânia ",
            "Sudão", "Palestina", 1
        )

        questionList.add(que10)

        return questionList
    }
}
