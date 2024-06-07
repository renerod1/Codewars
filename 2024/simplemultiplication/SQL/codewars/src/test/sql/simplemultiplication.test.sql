DB[:multiplication].multi_insert([
  {number: 2}, {number: 1}, {number: 8}, {number: 4}, {number: 5}  
])

results = run_sql

describe :columns do
   it "should return 2 columns" do
    expect(results.columns.count).to eq 2
   end
end

describe :column_names do
   it "should match column names" do
     expect(results.columns[0].to_s).to eq "number" 
     expect(results.columns[1].to_s).to eq "res" 
   end
end

compare_with expected do end