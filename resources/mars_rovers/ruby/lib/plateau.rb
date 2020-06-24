require_relative "./vector"

class Plateau
  def initialize(top_right)
    @bottom_left = Vector.new(0,0)
    @top_right = top_right
  end

  def contains?(coordinate)
    coordinate.x.between?(@bottom_left.x, @top_right.x) and
      coordinate.y.between?(@bottom_left.y, @top_right.y)
  end
end
