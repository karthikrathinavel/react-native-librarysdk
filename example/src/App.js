import React, {useEffect} from 'react';
import {Text,TouchableOpacity,View, StyleSheet} from 'react-native';
import {requestUserPermission, NotificationServices} from './PushNotifications.js';
import Librarysdk from './CustomModule.js';
const App = () => {
   function m1(){
        let jsonData = {
               "uid": "1",
                "adid": "8",
                "useruid": "7",
               "name": "karthik",
               "age": "22",
               "email": "email2@email.com",
               "phone": "1234567890",
               "gender": "M",
               "profileURL": "https://github.com/karthikrathinavel",
               "dob": "26/01/2001",
               "education": "B.E",
               "employed": false,
               "married": false,
               "token": "em3EVov-Rzy3wkLqnmGipd:APA91bGQZzMMqY1u2HOdLBe3owHUSDkG52n55T6J6Tj-DwJeUpCX4Hks25NzL18tQ2kyMxZOtXLCBy7U5aaOMQsaf8cCnNgw9b9L4mBzXzXNtOB75rp6Mz8tK6Ag66GRlZoFtKRwNznk"
             }
             let jsonString = JSON.stringify(jsonData);
             Librarysdk.onDeviceUserRegister(jsonString);
             Librarysdk.updatePushToken(jsonString);

   }
  Librarysdk.multiply(1.23,45.43);
  function m1(){
  }
  useEffect(()=>{
              requestUserPermission();
              NotificationServices();
          },[]);
  return(
    <View>
      <TouchableOpacity onPress={m1} style = {styles.countContainer}><Text>onDeviceUserRegister</Text></TouchableOpacity>
    </View>
  );
}
const styles = StyleSheet.create({
 countContainer: {
   alignItems: "center",
   padding: 10,
   margin: 5,
   backgroundColor: 'rgba(0,0,0,0.2)',
 }
});
export default App;
