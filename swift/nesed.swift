import Foundation

print("Enter a num1: ", terminator: "")
if let input1 = readLine(), let amount = Int(input1) {
    
    print("Enter a num2: ", terminator: "")
    if let input2 = readLine(), let balance = Int(input2) {
        
        if amount > balance {
            print("Insufficient Funds: \(amount)")
        } 
         else if amount % 100 != 0
         {
            print("Amount should be a multiple of 100: \(balance)")
        }
        else{
    print("Transaction Successful:\(amount)")
    }

     }
    }
   