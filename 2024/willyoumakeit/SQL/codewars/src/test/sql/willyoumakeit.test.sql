DB[:zerofuel].multi_insert([
  {distance_to_pump: 50, mpg: 25, fuel_left: 2}, 
  {distance_to_pump: 60, mpg: 30, fuel_left: 3},
  {distance_to_pump: 70, mpg: 25, fuel_left: 1},
  {distance_to_pump: 100, mpg: 25, fuel_left: 3}
])

results = run_sql

describe :columns do
   it "should return 4 columns" do
      expect(results.columns.count).to eq 4
   end
end

describe :column_names do
   it "should match column names" do
      expect(results.columns[0].to_s).to eq "distance_to_pump" 
      expect(results.columns[1].to_s).to eq "mpg" 
      expect(results.columns[2].to_s).to eq "fuel_left" 
      expect(results.columns[3].to_s).to eq "res" 
   end
end

compare_with expected do end