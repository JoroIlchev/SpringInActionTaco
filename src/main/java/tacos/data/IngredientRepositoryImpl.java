
//NOW WE ARE USING Spring JPA and we dont need this implementation anymore

//package tacos.data;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//import tacos.Ingredient;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//@Repository
//public class IngredientRepositoryImpl implements IngredientRepository{
//
//    private JdbcTemplate jdbc;
//
//    @Autowired
//    public IngredientRepositoryImpl(JdbcTemplate jdbc) {
//        this.jdbc = jdbc;
//    }
//
//    @Override
//    public Iterable<Ingredient> findAll() {
//        return jdbc.query("select id, name, type from Ingredient", this::mapRowToIngredient);
//    }
//
//
//    @Override
//    public Ingredient findOne(String id) {
//        return jdbc.queryForObject("select id, name, type from Ingredient where id=?",this::mapRowToIngredient, id );
//    }
//
//    @Override
//    public Ingredient save(Ingredient ingredient) {
//         jdbc.update("insert into Ingredients values (?,?,?)",
//                ingredient.getId(),
//                ingredient.getName(),
//                ingredient.getType().toString());
//         return ingredient;
//    }
//
//
//    private Ingredient mapRowToIngredient(ResultSet rs, int rowNum)
//            throws SQLException {
//        return new Ingredient(
//                rs.getString("id"),
//                rs.getString("name"),
//                Ingredient.Type.valueOf(rs.getString("type")));
//    }
//}
