DB[:nospace].multi_insert([
  {x: "8 j 8   mBliB8g  imjB8B8  jl  B"}, 
  {x: "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"}, 
  {x: "8aaaaa dddd r     "}, 
  {x: "jfBm  gk lf8hg  88lbe8 "},
  {x: "8j aam"}
])
  
results = run_sql

describe :columns do
   it "should return 2 columns" do
    expect(results.columns.count).to eq 2
   end
end

describe :column_names do
   it "should match column names" do
     expect(results.columns[0].to_s).to eq "x" 
     expect(results.columns[1].to_s).to eq "res" 
   end
end

compare_with expected do end