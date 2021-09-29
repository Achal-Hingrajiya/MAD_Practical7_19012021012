package src

class LoginInfo {
    companion object{

        lateinit var full_name : String;
        lateinit var  phone_number : String;
        lateinit var city: String;
        lateinit var email : String;
        lateinit var password: String;
        var logged_in : Boolean = false;


        fun register(full_name : String, phone_number : String, city : String, email : String, password : String){
            this.full_name = full_name
            this.phone_number = phone_number
            this.city = city
            this.email = email
            this.password = password
        }
        fun login(email : String, password : String):Boolean{
            if (this.email == email && this.password == password){
                logged_in = true
                return true
            }
            return false
        }
        fun logout(){
            logged_in = false
        }
    }
}