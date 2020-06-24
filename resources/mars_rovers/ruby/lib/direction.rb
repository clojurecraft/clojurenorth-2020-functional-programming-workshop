require_relative "./vector"

class Direction
  def initialize(direction)
    @direction = direction
  end

  def right()
    @direction =
      case @direction
        when :N then :E
        when :E then :S
        when :S then :W
        when :W then :N
      end
  end

  def left()
    @direction =
      case @direction
        when :N then :W
        when :W then :S
        when :S then :E
        when :E then :N
      end
  end

  def to_keyword()
    @direction
  end

  def movement_vector()
    case @direction
      when :N then Vector.new(0,1)
      when :E then Vector.new(1,0)
      when :S then Vector.new(0,-1)
      when :W then Vector.new(-1,0)
    end
  end
end
