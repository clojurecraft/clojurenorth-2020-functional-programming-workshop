require_relative "./direction"

class Rover

  def initialize(plateau, direction, coordinates)
    @plateau = plateau
    @direction = direction
    @location = coordinates
  end

  def run(commands)
    commands.each do |command|
      case command
        when :R then @direction.right()
        when :L then @direction.left()
        when :M then move()
      end
    end
  end

  def position()
    [@location.x, @location.y, @direction.to_keyword]
  end

  def move()
    potential_location = @direction.movement_vector().add(@location)
    if @plateau.contains?(potential_location)
      @location = potential_location
    end
  end

end
