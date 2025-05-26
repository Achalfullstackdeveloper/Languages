import Foundation

print("Enter a num1: ", terminator: "")
if let input1 = readLine(), let num1 = Int(input1) {
    
    print("Enter a num2: ", terminator: "")
    if let input2 = readLine(), let num2 = Int(input2) {
        
        if num1 > num2 {
            print("num1 is larger: \(num1)")
        } 
         else {
            print("num2 is larger: \(num2)")
        }
     }
    }