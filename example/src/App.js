import React, {useEffect} from 'react';
import {Text,TouchableOpacity,View} from 'react-native';
import {requestUserPermission, NotificationServices} from './PushNotifications.js';
const App = () => {
  function m1(){
  }
  useEffect(()=>{
              requestUserPermission();
              NotificationServices();
          },[]);
  return(
    <View>
      <TouchableOpacity onPress={m1}><Text>Sample</Text></TouchableOpacity>
    </View>
  );
}
export default App;
