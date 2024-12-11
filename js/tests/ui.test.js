const test = require('tape')
const UI = require('../ui').UI

class FakeConsoleInteractor{
  constructor(inputs){
    this.inputs = inputs
    this.outputs = []
  }

  readInput(){
    return this.inputs.shift()
  }

  printMessage(message){
    this.outputs.push(message)
  }

}

test('main loop', (t) => {
  /* TODO
    Given the following inputs:
    - hello
    - oto
    - quit

    Check that the following messages are printed:
    - olleh
    - oto
    - That was a palindrome!
   */

  const ui = new UI(new FakeConsoleInteractor(["hello","oto","quit"]))
  ui.mainLoop()
  t.deepEqual(ui.interactor.outputs, ["olleh", "oto", "That was a palindrome!"])
  t.end()
})
