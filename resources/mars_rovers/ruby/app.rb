# If you have ruby installed, you can run this project by doing: ruby app.rb

require_relative "./lib/rover"
require_relative "./lib/direction"
require_relative "./lib/plateau"
require_relative "./lib/vector"

r = Rover.new(Plateau.new(Vector.new(5,5)), Direction.new(:N), Vector.new(0,0))
r.run([:M, :M, :M, :R, :M, :R])
puts r.position

puts r.position == [1,3,:S]
