# The State design pattern:
    It allows an object to alter its behaviour when its internal state changes. The object will appear to change its class.
    
##### Case of soda vending machine: 
    - Obvious solution:
        * Create a SodaMachine Class
        * Create If/Switch Statement for each state and respond accordingly
        * It's not a flexible solution when a new state or spec altered (e.g. give a soda for free for every 10 bought soda) then we have to change all our code.
