class Vector
  def initialize(x, y)
    @x = x
    @y = y
  end

  def add(vector)
    @x += vector.x
    @y += vector.y
  end

  def subtract(vector)
    @x -= vector.x
    @y -= vector.y
  end

  def x
    @x
  end

  def y
    @y
  end
end

