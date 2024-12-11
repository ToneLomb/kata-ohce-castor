const test = require('tape')
const Greeter = require('../greeter').Greeter

class FakeClock{
  constructor(hour){
    this.hour = hour
  }

  currentHour(){
    return this.hour
  }

  setHour(hour){
    this.hour = hour
  }
}


test('should say "good night" at midnight', (t) => {
  const greeter = new Greeter(new FakeClock(0))
  t.equal(greeter.greet(), 'Good night')
  t.end()
})

test('should never return undefined', (t) => {
  const greeter = new Greeter(new FakeClock(0))
  let is_undefined = false
  for(let i = 0; i <= 23; i++) {
    greeter.clock.setHour(i)
    if (greeter.greet() === undefined){
      is_undefined = true
    }
  }
  t.equal(is_undefined, false)
  t.end()
})
